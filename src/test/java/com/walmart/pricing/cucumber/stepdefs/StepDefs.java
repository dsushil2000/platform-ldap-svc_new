package com.walmart.pricing.cucumber.stepdefs;

import com.walmart.pricing.PricingPlatformLdapSvcApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PricingPlatformLdapSvcApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
