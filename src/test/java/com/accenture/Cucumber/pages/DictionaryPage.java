package com.accenture.Cucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("https://www.youtube.com/")
public class DictionaryPage extends PageObject {

    @FindBy(xpath="//input[@id='search']")
    private WebElementFacade inputSearch;

    @FindBy(xpath="//body[@dir='ltr']/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@class='style-scope ytd-page-manager']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]")
    private WebElementFacade seleccionarVideo;
    
    @FindBy(xpath="//ytd-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-default size-default']//yt-formatted-string[@id='text']")
    private WebElementFacade compartirVideo;
    
    @FindBy(xpath="//div[@id='contents']//ytd-share-target-renderer[4]//button[1]//yt-icon[1]")
    private WebElementFacade clickCompartirVideo;
    
    
    @FindBy(xpath="//*[@id='identifierId']")
    private WebElementFacade campoEmail;
    
    
    @FindBy(name="password")
    private WebElementFacade campoContrasena;
    
    @FindBy(xpath="//div[@class='O0WRkf zZhnYe e3Duub C0oVfc']//content[@class='CwaK9']")
    private WebElementFacade clickCompartirVideoGooglePlus;
  
    
    
    public void enter_keywords(String keyword) {
    	inputSearch.type(keyword);
    }

    public void lookup_terms() {
    	seleccionarVideo.click();
    }
    
    public void compartirVideo() {
    	compartirVideo.click();
	}
    
    public void compartirVideoGoogle() {
    	clickCompartirVideoGooglePlus.click();
	}
    
    public void clickCompartirVideo() {
    	clickCompartirVideo.click();
    	
        ArrayList<String> newTab = new ArrayList<String>(getDriver().getWindowHandles());

    	// Cierro la actual
    	//getDriver().close();

    	// newTab.remove(oldTab);

    	// Cambio a la ultima pestaña
    	getDriver().switchTo().window(newTab.get(newTab.size() - 1)); 
	}
    
    public void escribirEmail(String keyword) {
    	campoEmail.type(keyword);
    }
    
    public void escribirPass(String keyword) {
    	campoContrasena.type(keyword);
    }
    
    

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());
    }    
}