package com.accenture.Cucumber.steps.serenity;

import com.accenture.Cucumber.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }
    @Step
    public void entersEmail(String keyword) {
        dictionaryPage.escribirEmail(keyword);
    }
    @Step
    public void entersPass(String keyword) {
        dictionaryPage.escribirPass(keyword);
    }
    
    @Step
    public void compartirVideoGooglePlus() {
    	dictionaryPage.compartirVideoGoogle();
    }
    
    
    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
       System.out.println("------->>" + dictionaryPage.getDefinitions());
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
    @Step
    public void compartirVideo() {
    	dictionaryPage.compartirVideo();
    }
    
    @Step
    public void clickCompartirVideo() {
    	dictionaryPage.clickCompartirVideo();
    }
    
    @Step
    public void clickCompartirVideoGoogle() {
    	compartirVideoGooglePlus();
    }
    
    @Step
    public void escribir_email(String term) {
    	entersEmail(term);
    }
    
    @Step
    public void escribir_pass(String term) {
    	entersPass(term);
    }
}