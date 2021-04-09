package com.shan.tech.javlib.service.impl;

import com.shan.tech.javlib.mapper.VideoMapper;
import com.shan.tech.javlib.pojo.Video;
import com.shan.tech.javlib.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoServiceImpl implements VideoService {

  private VideoMapper videoMapper;

  @Override
  public Optional<Video> findById(Long id) {
    return videoMapper.findById(id);
  }

  @Override
  public List<Video> findVideosByTitle(String title) {
    return videoMapper.findVideosByTitle(title);
  }

  @Override
  public Optional<Video> findDetailedVideoById(Long id) {
    return videoMapper.findDetailedVideoById(id);
  }

  @Autowired
  public void setVideoMapper(VideoMapper videoMapper) {
    this.videoMapper = videoMapper;
  }
}