package com.enes.jobapplication.service;

import com.enes.jobapplication.expection.JobPostAlreadyExistsException;
import com.enes.jobapplication.expection.JobPostNotFoundException;
import com.enes.jobapplication.model.JobPost;
import com.enes.jobapplication.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;


    //method to return all JobPosts
    public List<JobPost> getAllJobPosts() {
        return repo.findAll();
    }

    public String deleteJobPost(int id) throws JobPostNotFoundException {
        try {
            JobPost deletedJobPost = repo.findById(id).orElse(null);
            if (deletedJobPost == null) {
                throw new JobPostNotFoundException("JobPost not found");
            }
            repo.delete(deletedJobPost);
            return "JobPost Deleted";
        } catch (Exception e) {
            throw new JobPostNotFoundException("JobPost not found");
        }
    }

    public void addJobPost(JobPost jobPost) {
        Optional<JobPost> alreadyExists = repo.findById(jobPost.getPostId());
        if (alreadyExists.isPresent()) {
            throw new JobPostAlreadyExistsException("JobPost already exists");
        }
        repo.save(jobPost);
    }


    public JobPost getJobPostById(int id) {
        return repo.findById(id).orElseThrow(() -> new JobPostNotFoundException("JobPost not found"));
    }

    public JobPost updateJobPost(JobPost jobPost) throws JobPostNotFoundException {
        try {
            return repo.save(jobPost);
        } catch (Exception e) {
            throw new JobPostNotFoundException(e.getMessage());
        }
    }

    public void load() {
        List<JobPost> jobs =
                new ArrayList<>(List.of(
                        new JobPost(1, "Software Engineer", "Exciting opportunity for a skilled software engineer.", 3, List.of("Java", "Spring", "SQL")),
                        new JobPost(2, "Data Scientist", "Join our data science team and work on cutting-edge projects.", 5, List.of("Python", "Machine Learning", "TensorFlow")),
                        new JobPost(3, "Frontend Developer", "Create amazing user interfaces with our talented frontend team.", 2, List.of("JavaScript", "React", "CSS")),
                        new JobPost(4, "Network Engineer", "Design and maintain our robust network infrastructure.", 4, List.of("Cisco", "Routing", "Firewalls")),
                        new JobPost(5, "UX Designer", "Shape the user experience with your creative design skills.", 3, List.of("UI/UX Design", "Adobe XD", "Prototyping"))

                ));
        repo.saveAll(jobs);
    }

    public List<JobPost> searchJob(String search) throws JobPostNotFoundException {
        return repo.findByPostProfileContainingOrPostDescContaining(search, search);
    }
}
