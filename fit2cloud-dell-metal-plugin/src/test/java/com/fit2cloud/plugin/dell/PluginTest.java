package com.fit2cloud.plugin.dell;

import com.fit2cloud.metal.sdk.IMetalProvider;
import com.fit2cloud.metal.sdk.model.request.IPMISnmpRequest;
import com.fit2cloud.plugin.dell.utils.IDrac7RestSpider;
import com.fit2cloud.plugin.dell.utils.IDrac8RestSpider;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

public class PluginTest {
    private IPMISnmpRequest request;
    private IMetalProvider iMetalProvider;
    private Gson gson;

    @Before
    public void setP() {
        request = new IPMISnmpRequest("xx", "root", "calvin");
//        request = new IPMISnmpRequest("10.132.47.217", "root", "Fit2cloud@2019");
        request.setCommunity("public");
        request.setPort(161);
        iMetalProvider = new DellMetalProvider();
        gson = new Gson();
    }

    @Test
    public void testGetMachineEntity() {
        System.out.println(gson.toJson(iMetalProvider.getMachineEntity(gson.toJson(request))));
    }

    @Test
    public void testGetMetrics() {
        System.out.println(gson.toJson(iMetalProvider.getMetric(gson.toJson(request))));
    }

    @Test
    public void testIDrac7() {
        System.out.println(gson.toJson(new IDrac7RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
//        System.out.println(gson.toJson(new IDrac7RestSpider().logout(request.getHost())));
        System.out.println("--------");
        System.out.println(gson
                .toJson(new IDrac7RestSpider().logout(request.getHost())));
        System.out.println(gson.toJson(new IDrac7RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
    }

    @Test
    public void testIDrac8() {
        System.out.println(gson.toJson(new IDrac8RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
        System.out.println("--------");
        System.out.println(gson.toJson(new IDrac8RestSpider().logout(request.getHost())));
        System.out.println(gson.toJson(new IDrac8RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
    }

    @Test
    public void testIDrac7Power() {
        System.out.println(new IDrac7RestSpider().getPowerMetric(request.getHost(), request.getUserName(), request.getPwd()));
    }

    @Test
    public void testIDrac8Power() {
        System.out.println(new IDrac8RestSpider().getPowerMetric(request.getHost(), request.getUserName(), request.getPwd()));
    }

    @Test
    public void testHighFrequencySpider() {
        for (int i = 0; i < 20; i++) {
            request = new IPMISnmpRequest("xx", "xx", "xx");
            System.out.println(gson.toJson(new IDrac8RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
            request = new IPMISnmpRequest("xx", "xx", "xx");
            System.out.println(gson.toJson(new IDrac7RestSpider().getMachineEntity(request.getHost(), request.getUserName(), request.getPwd())));
        }
    }
}
