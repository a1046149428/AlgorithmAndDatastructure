package design.pattern.command;

/**
 * 命令模式
 * 优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。
 * 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。
 * 使用场景：认为是命令的地方都可以使用命令模式，
 * 比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
 * 注意事项：系统需要支持命令的撤销(Undo)操作和恢复(Redo)操作，也可以考虑使用命令模式，见命令模式的扩展。
 * 命令模式,具有一定的复杂性,因为需要扩展许多的命令具体类
 * 首先将命令封装成一个对象,客户端只要调用这个对象,并且传入合适的命令(合适的命令的生成需要合适的对象),然后命令就会找对象去执行方法了
 * 命令模式支持多变复杂的操作,比如:要执行多种名,仅需要封装在一个命令之中,便可以执行起来.
 * @author cherbini
 * 2018/10/31 16:18
 */
public interface Command
{
    void execute();

    void undo();
}