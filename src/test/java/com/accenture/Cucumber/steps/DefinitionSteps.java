package com.accenture.Cucumber.steps;


import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.accenture.Cucumber.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("Abrir youtube")
    public void abrirYoutube() {
        anna.is_the_home_page();
    }

    @When("buscar video '(.*)'")
    public void escribirVideo(String word) throws InterruptedException {
        anna.looks_for(word + '\n');
        
        Thread.sleep(3000);
    }
    
    
    
    @When("compartir video")
    public void compartirVideo() throws InterruptedException {
       anna.compartirVideo();
       
       Thread.sleep(5000);
    }
    
    @When("click compartir video")
    public void clickCompartirVideo() throws InterruptedException {
       anna.clickCompartirVideo();
       
       Thread.sleep(3000);
    }
    
    @When("escribir correo '(.*)'")
    public void escribirCorreo(String word) {
        anna.escribir_email(word + '\n');
       
    }
    
    @When("escribir contrasena '(.*)'")
    public void escribirContrasena(String word) {
        anna.escribir_pass(word + '\n');
        System.out.println(">>>>>>>>" + word);
       
    }
    
    @When("google plus")
    public void clickCompartirVideoGoogle() throws InterruptedException {
       Thread.sleep(2000);
       anna.clickCompartirVideoGoogle();
       
    }
    
    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
       //seeThat(TheWebPage.title(), containsString("")); 
    }

}
