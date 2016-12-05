package com.stephengream.skeleton.selenium;

import com.stephengream.skeleton.SkeletonBootAngular2Application;
import com.stephengream.skeleton.testutil.InitialisationListener;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;
import static org.openqa.selenium.By.id;


/**
 * Created by stephen on 5/12/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = SkeletonBootAngular2Application.class)
public class IndexControllerTest {
    @Autowired
    private InitialisationListener listener;

    private WebDriver webDriver;

    private Integer port;

    @Before
    public void setup(){
        port = listener.getPort();
        System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:"+port+"/");
    }

    @After
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }

    @Test
    public void checkHeaderContents() throws InterruptedException {
        WebElement element = webDriver.findElement(id("test-header"));
        assertThat(element.getText(), equalToIgnoringCase("Hello World!"));
    }
}
