package tutorial.bolt.sample;

import com.slack.api.bolt.App;
import com.slack.api.bolt.response.Response;
import com.slack.api.bolt.servlet.SlackAppServlet;
import com.slack.api.model.event.AppHomeOpenedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;

@WebServlet("/slack/events")
public class MyApp extends SlackAppServlet {
    private static final Logger logger = LoggerFactory.getLogger(MyApp.class);

    private static final long serialVersionUID = 1L;

    public MyApp() {
        super(initSlackApp());
    }

    public MyApp(App app) {
        super(app);
    }

    private static App initSlackApp() {
        App app = new App();
        app.command("/hello", (req, ctx) -> {
            logger.info("/hello called!");
            logger.debug("/hello debug");
            return Response.ok(":wave: hello world");
        });
        app.event(AppHomeOpenedEvent.class, (payload, ctx) -> {
            logger.debug("app home opened!");
            return ctx.ack();
        });
        return app;
    }
}