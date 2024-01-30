package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.entity.Car;

@Mapper
public interface CarMapper {
    public List<Car> findAll();
    public void insert(Car car); //新規登録処理  
    public Car findById(Integer id);//一件取得処理
    public void update(Car car);//更新処理
    public void deleteById(Integer id);//削除処理
}