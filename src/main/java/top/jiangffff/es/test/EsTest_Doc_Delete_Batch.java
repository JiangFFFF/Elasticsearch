package top.jiangffff.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;

/**
 * 批量删除数据
 * @author JiangHuifeng
 * @create 2023-05-13-21:55
 */
public class EsTest_Doc_Delete_Batch {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        BulkRequest request = new BulkRequest();
        request.add(new DeleteRequest().index("user").id("1002"));
        request.add(new DeleteRequest().index("user").id("1003"));

        BulkResponse response = esClient.bulk(request, RequestOptions.DEFAULT);

        System.out.println("花费时间："+response.getTook());
        System.out.println(response.getItems());


        esClient.close();

        

    }
}
