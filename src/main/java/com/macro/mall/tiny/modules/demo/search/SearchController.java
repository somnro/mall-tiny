package com.macro.mall.tiny.modules.demo.search;

import com.ejlchina.searcher.MapSearcher;
import com.ejlchina.searcher.SearchResult;
import com.ejlchina.searcher.util.MapUtils;
import com.macro.mall.tiny.modules.ums.model.UmsResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * 文档：searcher.ejlchina.com/guide/latest/start.html#开始检索
 */
@RestController
@RequestMapping("/q")
public class SearchController {
    @Autowired
    private MapSearcher mapSearcher;

    /**
     * localhost:8080/q/1
     */
    @GetMapping("/1")
    public String test1(){
        return "233";
    }

    @GetMapping("/index")
    public SearchResult<Map<String, Object>> index(HttpServletRequest request) {
        // 一行代码，实现一个用户检索接口（MapUtils.flat 只是收集前端的请求参数）
        return mapSearcher.search(Resource.class, MapUtils.flat(request.getParameterMap()));
    }

    /**
     * localhost:8080/q/rc
     * localhost:8080/q/rc?size=1
     * {"totalCount":6,"dataList":[{"createTime":"2020-02-05T02:21:44.000+00:00","name":"商品模块","id":1,"sort":0}],"summaries":[]}
     * localhost:8080/q/rc?size=1&page=6 page从0开始，可设置
     *
     */
    @GetMapping("/rc")
    public SearchResult<Map<String, Object>> rc(HttpServletRequest request) {
        // 一行代码，实现一个用户检索接口（MapUtils.flat 只是收集前端的请求参数）
        return mapSearcher.search(ResourceCate.class, MapUtils.flat(request.getParameterMap()));
    }

    @GetMapping("/rc2")
    public List<Map<String, Object>> rc2(HttpServletRequest request) {
        // 一行代码，实现一个用户检索接口（MapUtils.flat 只是收集前端的请求参数）
        return mapSearcher.searchList(ResourceCate.class, MapUtils.flat(request.getParameterMap()));
    }

}
