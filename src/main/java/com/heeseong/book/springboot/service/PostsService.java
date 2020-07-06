package com.heeseong.book.springboot.service;

import com.heeseong.book.springboot.domain.posts.PostsRepository;
import com.heeseong.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    //@RequiredArgsConstructor final 로 선언된 모든 필드를 인자 값으로 하는 생성자를 대신 생성
    private final PostsRepository postsRepository;

    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}
