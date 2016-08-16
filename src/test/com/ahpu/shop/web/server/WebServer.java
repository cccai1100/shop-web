package com.ahpu.shop.web.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * Created by admin on 16/8/12.
 */
public class WebServer {
    public static void main(String[] args) {
        Server server = new Server(8080);
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setDescriptor("./src/main/webapp/WEB-INF/web.xml");
        context.setResourceBase("./src/main/webapp");
        //解决静态资源缓存后再ide里面不能修改问题
//        context.setDefaultsDescriptor("./shop-web/src/test/resources/webdefault.xml");
        context.setParentLoaderPriority(true);
        server.setHandler(context);

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
