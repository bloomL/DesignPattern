package com.practice.unit1;

/**
     * 采用了策略模式：
- 将叫声行为封装成独立的类
- 允许在运行时动态改变鸭子的叫声行为
- 方便添加新的叫声行为而不需要修改现有代码
 */
// 处理算法族，让算法可以独立于使用它的客户而变化。在您的例子中，飞行和叫声就是两个算法族，可以根据需要灵活组合使用。
public abstract class Duck {
    // 策略对象
    QuackBehavor quackBehavior;
    // 策略对象
    FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavor qb) {
        this.quackBehavior = qb;
    }
}