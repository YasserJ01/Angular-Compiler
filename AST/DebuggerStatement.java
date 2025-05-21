package AST;

public class DebuggerStatement {
    String debugger;
    Eos eos;

    public String getDebugger() {
        return debugger;
    }

    public void setDebugger(String debugger) {
        this.debugger = debugger;
    }

    public Eos getEos() {
        return eos;
    }

    public void setEos(Eos eos) {
        this.eos = eos;
    }

    @Override
    public String toString() {
        return "DebuggerStatement{" +
                "debugger='" + debugger + '\n' +
                ", eos=" + eos + '\n' +
                '}';
    }
}

