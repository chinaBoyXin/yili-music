package com.xin.yilimusic.mapper;

import com.xin.yilimusic.dto.UserDto;
import com.xin.yilimusic.entity.User;
import com.xin.yilimusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {

    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
