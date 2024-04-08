package com.project.board.mapper;

import java.util.List;

import org.apache.annotations.Mapper;

import com.project.board.vo.UserVo;

@Mapper
public interface UserMapper {

	List<UserVo> getUserList();

}
