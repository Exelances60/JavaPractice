package com.enes.jobapplication.repo;

import com.enes.jobapplication.model.JobPost;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    @Modifying
    @Transactional
    @Query("update JobPost jp set jp.postDesc = ?1, jp.postProfile = ?2, jp.reqExperience = ?3 where jp.postId = ?4")
    int updateJobPost(String postDesc, String postProfile, Integer reqExperience, Integer postId);

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}







   /* // arrayList to store store JobPost objects
    List<JobPost> jobs = new ArrayList<>();

    // ****************************************************************************

    // constructor->injecting objects into ArrayList defined above.
    public JobRepo() {

        // Java Developer Job Post

    }

    // ****************************************************************************

    // method to return all JobPosts
    public List<JobPost> returnAllJobPosts() {
        return jobs;
    }

    // method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
    }

    public Optional<JobPost> findJobPostById(int id) {
        return jobs.stream().filter(job -> job.getPostId() == id).findFirst();
    }

    public JobPost deleteJobPost(int id) {
        JobPost jobPost = findJobPostById(id).orElse(null);
        jobs.remove(jobPost);
        return jobPost;
    }

    public JobPost updateJobPost(JobPost jobPost) {
        JobPost jobPostFind = null;
        for (JobPost job : jobs) {
            if (job.getPostId() == jobPost.getPostId()) {
                jobPostFind = job;
            }
        }
        if (jobPostFind != null) {
            jobPostFind.setPostProfile(jobPost.getPostProfile());
            jobPostFind.setPostDesc(jobPost.getPostDesc());
            jobPostFind.setReqExperience(jobPost.getReqExperience());
            jobPostFind.setPostTechStack(jobPost.getPostTechStack());
        }
        return jobPostFind;
    }

}
*/