package com.example.issuetest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAsync
@RestController
public class BugFixController {


  @GetMapping("/bug")
  public String get() throws JSONException {
    JSONObject jsonObject = new JSONObject();
    jsonObject.put("bug", "fix");

    return jsonObject.toString();
  }
}
