package com.example.demo.serviceImpl;

import com.example.demo.mapper.Empmapper;
import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Emp;
import com.example.demo.service.Empservice;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpserviceImpl implements Empservice {
    @Autowired
    Empmapper empmapper;

    @Override
    public PageInfo<Emp> sy(Integer PageNum, Integer PageSize, Integer deptno) {
        PageHelper.startPage(PageNum, PageSize);
        List<Emp> list = empmapper.sy(deptno);
        PageInfo<Emp> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<Dept> xl() {
        return empmapper.xl();
    }

    @Override
    public Emp ygcx(Integer empno) {
        return empmapper.ygcx(empno);
    }

    @Override
    public int xg1(Emp emp) {
        return empmapper.xg1(emp);
    }

    @Override
    public int xz(Emp emp) {
        return empmapper.xz(emp);
    }

    @Override
    public List<Emp> jl() {
        return empmapper.jl();
    }

    @Override
    public int sc(Integer empno) {
        return empmapper.sc(empno);
    }
}
