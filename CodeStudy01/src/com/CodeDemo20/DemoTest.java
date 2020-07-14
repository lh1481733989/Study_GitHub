package com.CodeDemo20;

public class DemoTest {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(12);
        //创建一个武器对象
        Stacked stacked = new Stacked();
        stacked.setStackName("多兰剑");//武器对象赋值
        hero.setStacked(stacked);

        /**
         * 使用单独的接口实现类实现
         */
//        Skill skill = new SkillClass();
//        hero.setSkill(skill);
        /**
         * 使用匿名内部类
         */
//        Skill skill1 = new Skill(){
//            @Override
//            public void use(){
//                System.out.println("ka~ka~ka");
//            }
//        };
//        hero.setSkill(skill1);

        /**
         * 进一步简化   同时使用匿名内部类和匿名对象
         */
        hero.setSkill(new SkillClass() {
                          @Override
                          public void use() {
                              System.out.println("ka1~ka1~ka1");
                          }
                      });
        hero.attcted();
    }
}
