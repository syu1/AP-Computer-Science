
public class Door
{
private String state;
private String name;

public Door(String newname, String Status)
{
    this.state = Status;
    this.name = newname;
}
public String getState()
{
    return this.state;
}
public void Close()
{
    this.state = "Closed";
}
public void Open()
{
    this.state = "Open";
}
public String getName()
{
    return this.name;
}
public void setName(String newName)
{
    this.name = newName;
}
public void setState(String newState)
{
    this.state = newState;
}

}