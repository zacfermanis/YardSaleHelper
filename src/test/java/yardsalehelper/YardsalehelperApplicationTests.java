package yardsalehelper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yardsalehelper.app.YardsalehelperApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = YardsalehelperApplication.class)
@WebAppConfiguration
public class YardsalehelperApplicationTests {

	@Test
	public void contextLoads() {
	}

}
