package com.example.issuetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IssueController {

  @GetMapping("/issue")
  public String issue() {
    return "result issue";
  }

  @PostMapping
  public String postIssue() {
    return "result post issue";
  }
}
