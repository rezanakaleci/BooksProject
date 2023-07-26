package com.demoqa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/demoqa/step_defenition",
        dryRun = false,
        tags = "@wip3"
)


public class Runner {



}
