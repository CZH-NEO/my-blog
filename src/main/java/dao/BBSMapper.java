package dao;

import model.BBS;

public interface BBSMapper {
    int deleteByPrimaryKey(String ip);

    int insert(BBS record);

    int insertSelective(BBS record);

    BBS selectByPrimaryKey(String ip);

    int updateByPrimaryKeySelective(BBS record);

    int updateByPrimaryKey(BBS record);
}