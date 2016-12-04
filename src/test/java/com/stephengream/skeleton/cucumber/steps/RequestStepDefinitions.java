package com.stephengream.skeleton.cucumber.steps;

import com.stephengream.skeleton.SkeletonBootAngular2Application;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by stephen on 4/12/16.
 */
/**
 * Created by stephen on 4/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SkeletonBootAngular2Application.class, loader = SpringBootContextLoader.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RequestStepDefinitions {
    protected ResponseEntity<Void> latestResponse;

    @Autowired
    protected TestRestTemplate restTemplate;

    public RequestStepDefinitions(){
    }

    @Then("^the client receives status code of (\\d+)$")
    public void theClientReceivesStatusCode(Integer id){
        assertEquals((long)id, (long)latestResponse.getStatusCodeValue());
    }

    @When("^the client calls /([^\\s]+)")
    public void theClientCallsUrl(String url) throws Throwable {
        String absoluteUrl = "/" + url;
        latestResponse = restTemplate.getForEntity(absoluteUrl, Void.class);
    }
}
