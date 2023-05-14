package top.jiangffff.es.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;

import java.io.IOException;

/**
 * 批量插入数据
 * @author JiangHuifeng
 * @create 2023-05-13-21:55
 */
public class EsTest_Doc_Insert_Batch {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );

        // 批量插入数据
        BulkRequest request = new BulkRequest();
        ObjectMapper mapper = new ObjectMapper();
        request.add(new IndexRequest().index("user").id("1001").source(mapper.writeValueAsString(new User("张三","男",30)),XContentType.JSON));
        request.add(new IndexRequest().index("user").id("1002").source(mapper.writeValueAsString(new User("里斯","男",40)),XContentType.JSON));
        request.add(new IndexRequest().index("user").id("1003").source(mapper.writeValueAsString(new User("王武","男",50)),XContentType.JSON));
        request.add(new IndexRequest().index("user").id("1004").source(mapper.writeValueAsString(new User("王武1","女",75)),XContentType.JSON));
        request.add(new IndexRequest().index("user").id("1005").source(mapper.writeValueAsString(new User("王武2","男",50)),XContentType.JSON));
        request.add(new IndexRequest().index("user").id("1006").source(mapper.writeValueAsString(new User("王武3","女",18)),XContentType.JSON));

        BulkResponse response = esClient.bulk(request, RequestOptions.DEFAULT);

        System.out.println("花费时间："+response.getTook());
        System.out.println(response.getItems());


        esClient.close();

        

    }
}
