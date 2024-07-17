package com.enes.jobapplication.controller;

import com.enes.jobapplication.expection.JobPostNotFoundException;
import com.enes.jobapplication.handler.ResponseHandler;
import com.enes.jobapplication.model.JobPost;
import com.enes.jobapplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public ResponseEntity<List<JobPost>> returnAllJobPosts() {
        return ResponseHandler.generateResponse(HttpStatus.OK, "All Job Posts", jobService.getAllJobPosts());
    }

    @GetMapping("jobPost/{id}")
    public ResponseEntity<JobPost> getJob(@PathVariable String id) {
        JobPost jobPost = jobService.getJobPostById(Integer.parseInt(id));
        return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post", jobPost);
    }

    @GetMapping("jobPost/search/{search}")
    public ResponseEntity<List<JobPost>> searchJob(@PathVariable String search) {
        return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post", jobService.searchJob(search));
    }


    @DeleteMapping("jobPost/{id}")
    public ResponseEntity<String> deleteJobPost(@PathVariable String id) {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Deleted", jobService.deleteJobPost(Integer.parseInt(id)));
        } catch (JobPostNotFoundException e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @PostMapping("jobPost")
    public ResponseEntity<JobPost> addJobPost(@RequestBody JobPost jobPost) {
        try {
            jobService.addJobPost(jobPost);
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Added", jobService.getJobPostById(jobPost.getPostId()));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @PutMapping("jobPost")
    public ResponseEntity<JobPost> updateJobPost(@RequestBody JobPost jobPost) {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Updated", jobService.updateJobPost(jobPost));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @GetMapping("load")
    public void load() {
        jobService.load();
    }

}
