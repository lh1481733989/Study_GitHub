package com.CodeDemo20;

/**
 * 英雄类
 */
public class Hero {
    private String name;
    private int age;
    private Stacked stacked;//武器类作为成员变量
    private Skill skill;//接口作为成员变量

    /**
     * 攻击方法
     */
    public void attcted(){
        System.out.println(age+"岁的"+name+"用"+stacked.getStackName()+"和");
        skill.use();
        System.out.println("技能攻击敌方");
    }

    public Hero(String name, int age, Stacked stacked , Skill skill) {
        this.name = name;
        this.age = age;
        this.stacked = stacked;
        this.skill =  skill;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Stacked getStacked() {
        return stacked;
    }

    public void setStacked(Stacked stacked) {
        this.stacked = stacked;
    }
}
