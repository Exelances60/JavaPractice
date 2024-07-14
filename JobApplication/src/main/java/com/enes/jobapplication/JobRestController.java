package com.enes.jobapplication;

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
    public ResponseEntity<Object> returnAllJobPosts() {
        return ResponseHandler.generateResponse(HttpStatus.OK, "All Job Posts", jobService.returnAllJobPosts());
    }

    @GetMapping("jobPost/{id}")
    public ResponseEntity<Object> getJob(@PathVariable String id) throws JobPostNotFoundException {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post", jobService.getJobPostById(id));
        } catch (JobPostNotFoundException e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @DeleteMapping("jobPost/{id}")
    public ResponseEntity<Object> deleteJobPost(@PathVariable String id) throws JobPostNotFoundException {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Deleted", jobService.deleteJobPost(id));
        } catch (JobPostNotFoundException e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @PostMapping("jobPost")
    public ResponseEntity<Object> addJobPost(@RequestBody JobPost jobPost) {
        try {
            jobService.addJobPost(jobPost);
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Added", jobService.getJobPostById(String.valueOf(jobPost.getPostId())));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

    @PutMapping("jobPost")
    public ResponseEntity<Object> updateJobPost(@RequestBody JobPost jobPost) {
        try {
            jobService.updateJobPost(jobPost);
            return ResponseHandler.generateResponse(HttpStatus.OK, "Job Post Updated", jobService.getJobPostById(String.valueOf(jobPost.getPostId())));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }

}
