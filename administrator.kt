import Payment.*

class Administrator (var emploiee:String,var deistvia:Double,ename:String,emap:Int,ebloc:String,echeck:Int):Payments(ename,emap,ebloc,echeck)
{
    open fun  chec()
    {
        if(map>1000)println("номер банковской карты пользователя который может проверять администратор :$map ,у которого на счете $check")
        else("не сушествует такой карты")
        if(check<=0.0)println("администратор обнаружил подозрительные действия по карте $map и заблокировал")
        else ("с картой все в порядке")
    }
    open fun sotrudnik()
    {
        println("в банке $name работает сотрудник $emploiee")
    }
    open fun rabota()
    {
        println("сотрудник обнаружил $deistvia действий с этой карты $map")
    }
}