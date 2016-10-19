import com.borland.silktest.jtf.Desktop;
import com.borland.silk.keyworddriven.annotations.Keyword;
import com.borland.silktest.jtf.BrowserBaseState;
import com.borland.silktest.jtf.xbrowser.DomTextField;
import com.borland.silktest.jtf.common.types.MouseButton;
import com.borland.silktest.jtf.common.types.Point;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomElement;
import org.junit.Assert;

public class FirstKeywordsStored {

	private Desktop desktop = new Desktop();

	@Keyword(value = "Start application", isBaseState = true)
	public void start_application() {
		// Go to web page 'http://demo.borland.com/InsuranceWebExtJS'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}
	
	@Keyword(value = "Close Browser")
	public void close_browser() {
		desktop.<BrowserApplication> find("WebBrowser").setActive();
		desktop.<BrowserApplication> find("WebBrowser").close();
	}

	@Keyword(value = "Login")
	public void login() {
		desktop.<DomTextField> find("demo_borland_com.BrowserWindow.login-form email").typeKeys("mihai.test@email.com");
		desktop.<DomTextField> find("demo_borland_com.BrowserWindow.login-form password")
				.typePasswordKeys("5k9xGdisGoHGwGub");
		desktop.<DomButton> find("demo_borland_com.BrowserWindow.login-form login").click();
	}

	@Keyword(value = "validate invalid login")
	public void validate_invalid_login() {
		DomElement nonExistingEmail = desktop.<DomElement> find("demo_borland_com.BrowserWindow.Non-existing email,");
		Assert.assertEquals(true, nonExistingEmail.isVisible());
		Assert.assertEquals("Non-existing email, please try again.", nonExistingEmail.getText());
	}

}