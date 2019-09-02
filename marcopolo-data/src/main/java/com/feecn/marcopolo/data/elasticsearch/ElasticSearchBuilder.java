package com.feecn.marcopolo.data.elasticsearch;

import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author pczhangyu
 * elasticsearch 客户端类
 */
public class ElasticSearchBuilder {

    private static Client client = null;

//    private static final String HOST = "192.168.128.148";
//
//    private static final String CLUSTER_NAME = "ape-area";

    private static final String HOST = "10.221.130.226";

    private static final String CLUSTER_NAME = "bs-test-cluster";

    private static final int PORT = 9300;

    private ElasticSearchBuilder() {
        // do nothing
    }

    public static synchronized Client build () throws UnknownHostException {
        if (client==null){
            Settings settings = Settings.builder().put("cluster.name",CLUSTER_NAME).build();
            client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new TransportAddress(InetAddress.getByName(HOST), PORT));
        }
        return client;
    }

    public static void main(String[] args) throws UnknownHostException {
        Client build = ElasticSearchBuilder.build();
        GetResponse response = ElasticSearchBuilder.build().prepareGet("xx", "xxx", "6W2QKmMBhrIcTC9dgt7A").execute().actionGet();
        BulkRequest bulkRequest = new BulkRequest();
//        new StreamInput();
//        bulkRequest.readFrom();
        build.bulk(bulkRequest);
        System.out.println(response);
    }
}
