package app;

import com.sun.jdi.VMDisconnectedException;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventSet;
import debugger.Debugger;
import samples.JDIExampleDebuggee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Debugger Start. . . ");

        Debugger debuggerInstance = new Debugger();
        debuggerInstance.run();
    }
}
