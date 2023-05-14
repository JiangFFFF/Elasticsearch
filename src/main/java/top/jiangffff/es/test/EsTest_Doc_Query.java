package top.jiangffff.es.test;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.unit.Fuzziness;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.aggregations.bucket.terms.TermsAggregationBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.sort.SortOrder;

import javax.naming.directory.SearchResult;
import java.io.IOException;

/**
 * 查询数据
 *
 * @author JiangHuifeng
 * @create 2023-05-13-21:55
 */
public class EsTest_Doc_Query {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http"))
        );

        /**
         * 全部查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        // 查询索引中全部数据
//        request.source(new SearchSourceBuilder().query(QueryBuilders.matchAllQuery()));
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数："+hits.getTotalHits());
//        System.out.println("花费时间："+response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         * 条件查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        request.source(new SearchSourceBuilder().query(QueryBuilders.termQuery("age",30)));
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数："+hits.getTotalHits());
//        System.out.println("花费时间："+response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         *  分页查询
         */
//        // (当前页码-1)*每页显示条数
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        builder.from(0);
//        builder.size(2);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         * 排序查询
         */
//        // (当前页码-1)*每页显示条数
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        builder.sort("age", SortOrder.DESC);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         * 过滤字段
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder().query(QueryBuilders.matchAllQuery());
//        String[] excludes = {};
//        String[] includes = {"name"};
//        builder.fetchSource(includes,excludes);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }


        /**
         * 组合查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
//
////        boolQueryBuilder.must(QueryBuilders.matchQuery("age",30));
////        boolQueryBuilder.must(QueryBuilders.matchQuery("sex","男"));
////        boolQueryBuilder.mustNot(QueryBuilders.matchQuery("sex","男"));
//
//        boolQueryBuilder.should(QueryBuilders.matchQuery("age",30));
//        boolQueryBuilder.should(QueryBuilders.matchQuery("age",40));
//
//        builder.query(boolQueryBuilder);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }


        /**
         * 范围查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        RangeQueryBuilder rangeQuery = QueryBuilders.rangeQuery("age");
//        rangeQuery.gte(30);
//        rangeQuery.lte(40);
//
//        builder.query(rangeQuery);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         * 模糊查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//
//        builder.query(QueryBuilders.fuzzyQuery("name","王武").fuzziness(Fuzziness.ONE));
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }

        /**
         * 高亮查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("name", "张三");
//        HighlightBuilder highlightBuilder = new HighlightBuilder();
//        highlightBuilder.preTags("<font color='red'>");
//        highlightBuilder.postTags("</font>");
//        highlightBuilder.field("name");
//        builder.highlighter(highlightBuilder);
//        builder.query(termQueryBuilder);
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }


        /**
         * 聚合查询
         */
//        SearchRequest request = new SearchRequest();
//        request.indices("user");
//
//        // 构建查询条件
//        SearchSourceBuilder builder = new SearchSourceBuilder();
//        AggregationBuilder aggregationBuilder = AggregationBuilders.max("maxAge").field("age");
//        builder.aggregation(aggregationBuilder);
//
//        request.source(builder);
//
//        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
//        System.out.println(response);
//        SearchHits hits = response.getHits();
//        System.out.println("总记录数：" + hits.getTotalHits());
//        System.out.println("花费时间：" + response.getTook());
//
//        for (SearchHit hit : hits) {
//            System.out.println(hit.getSourceAsString());
//        }


        /**
         * 分组查询
         */
        SearchRequest request = new SearchRequest();
        request.indices("user");

        // 构建查询条件
        SearchSourceBuilder builder = new SearchSourceBuilder();

        TermsAggregationBuilder aggregationBuilder = AggregationBuilders.terms("ageGroup").field("age");
        builder.aggregation(aggregationBuilder);

        request.source(builder);

        SearchResponse response = esClient.search(request, RequestOptions.DEFAULT);
        System.out.println(response);
        SearchHits hits = response.getHits();
        System.out.println("总记录数：" + hits.getTotalHits());
        System.out.println("花费时间：" + response.getTook());

        for (SearchHit hit : hits) {
            System.out.println(hit.getSourceAsString());
        }


        esClient.close();


    }
}
