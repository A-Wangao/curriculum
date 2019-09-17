package com.zb.fallback;

import com.zb.pojo.Chapter;

import com.zb.client.RestChapterClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class ChapterClientFallBack implements RestChapterClient {

    @Override
    public List<Chapter> getChapter()throws Exception{
    return null;
    }

    @Override
    public Chapter getChapterById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Chapter>	getChapterListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getChapterCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddChapter(Chapter chapter)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyChapter(Chapter chapter)throws Exception{
        return null;
    }
}
