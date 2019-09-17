package com.zb.fallback;

import com.zb.pojo.Note;

import com.zb.client.RestNoteClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class NoteClientFallBack implements RestNoteClient {

    @Override
    public List<Note> getNote()throws Exception{
    return null;
    }

    @Override
    public Note getNoteById(int id)throws Exception{
        return null;
    }

    @Override
    public List<Note>	getNoteListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getNoteCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddNote(Note note)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyNote(Note note)throws Exception{
        return null;
    }
}
