package com.example.demo.co;

import com.example.demo.pojo.Dept;
import com.example.demo.pojo.Emp;
import com.example.demo.service.Empservice;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Empco {

    @Autowired
    Empservice empservice;

    @RequestMapping("qqq")
    public String qwe(Model model, Integer PageNum, Integer deptno) {
        if (PageNum == null || PageNum == 0) {
            PageNum = 1;
        }
        Integer PageSize = 4;
        PageInfo<Emp> page = empservice.sy(PageNum, PageSize, deptno);
        model.addAttribute("page", page);
        return "qwe";
    }

    @RequestMapping("asd")
    public String asd() {
        return "asd";
    }

    @RequestMapping("xgcx")
    public String asd(Model model, Integer empno) {
        Emp emp = empservice.ygcx(empno);
        model.addAttribute("e", emp);
        return "xg";
    }

    @RequestMapping("asd")
    @ResponseBody
    public Object asddd() {
        List<Dept> list = empservice.xl();
        return list;
    }

    @RequestMapping("xg1")
    public String asdasda(Emp emp) {
        int i = empservice.xg1(emp);
        return "redirect:qqq";
    }

    @RequestMapping("asd1")
    @ResponseBody
    public Object asdd1d() {
        List<Emp> list = empservice.jl();
        return list;
    }

    @RequestMapping("add")
    public String asdsadas() {
        return "add";
    }

    @RequestMapping("xz")
    public String adasdas(Emp emp) {
        int i = empservice.xz(emp);
        return "redirect:qqq";
    }

    @RequestMapping("sc")
    @ResponseBody
    public Object sdasas(Integer empno) {
        int i = empservice.sc(empno);
        if (i > 0) {
            return "1";
        }
        return "2";
    }

}
