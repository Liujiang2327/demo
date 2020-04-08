package com.example.demo.service;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface Empservice {
    PageInfo<Emp> sy(Integer PageNum, Integer PageSize, Integer deptno);

    List<Dept> xl();

    Emp ygcx(Integer empno);

    int xg1(Emp emp);

    int xz(Emp emp);

    List<Emp> jl();

    int sc(Integer empno);
}
