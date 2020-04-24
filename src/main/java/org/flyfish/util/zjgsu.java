package org.flyfish.util;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import java.io.IOException;

/**
 * @author smallfish
 * @Title: zjgsu
 * @ProjectName toolMain
 * @date 18-11-11下午10:27
 */
public class zjgsu {

    //模拟浙江工商大学教务网的登录 可以适用于需要加载js才能登录的一些网页。 （实际类似于selenium） 用的是htmlunit
    public void login(String userName, String password) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setCssEnabled(false);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());
        HtmlPage page = webClient.getPage("http://124.160.64.163/jwglxt/xtgl/login_slogin.html");
        HtmlForm form = page.getForms().get(0);
        HtmlTextInput yhmInput = form.getInputByName("yhm");
        yhmInput.setValueAttribute(userName);
        HtmlElement passwordElement = (HtmlElement) page.getElementById("mm");
        passwordElement.click();
        passwordElement.type(password);
        System.out.println(page.asText());
        HtmlElement htmlButton = (HtmlElement) page.getElementById("dl");
        HtmlPage page2 = htmlButton.click();
        webClient.waitForBackgroundJavaScript(10000);
        System.out.println(page2.asText());
    }
}
