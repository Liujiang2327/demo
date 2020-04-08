package com.example.demo.mapper;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Emp;

import java.util.List;

public interface Empmapper {
    List<Emp> sy(Integer deptno);

    List<Dept> xl();

    Emp ygcx(Integer empno);

    int xg1(Emp emp);

    int xz(Emp emp);

    List<Emp> jl();

    int sc(Integer empno);

}
