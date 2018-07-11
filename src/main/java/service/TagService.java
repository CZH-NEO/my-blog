package service;


import dao.TagMapper;
import model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("tagService")
public class TagService {
    @Autowired
    @Qualifier("tagMapper")
    private TagMapper dao;

    public void setDao(TagMapper dao) {
        this.dao = dao;
    }

    public void addTag(Tag tag)
    {
        dao.insert(tag);
    }
    public void deleteTag(Integer id)
    {
        dao.deleteByPrimaryKey(id);
    }
    public void selectTagById(Integer id)
    {
        dao.selectByPrimaryKey(id);
    }
    public void updateTagById(Tag tag)
    {
        dao.updateByPrimaryKey(tag);
    }

}
