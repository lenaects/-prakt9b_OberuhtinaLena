import Payment.*

class Client (var order:Int,empname:String,empmap:Int,empbloc:String,empcheck:Int):Payments(empname,empmap,empbloc,empcheck)
{
    open fun status()
    {
       if(bloc=="да") println("клиент заблокировал карту")
        else if(bloc=="нет")println("клиент не заблокировал карту")
        else println("нужно выбрать да/нет")
    }
    open fun info()
    {
        if(map>1000)println("номер банковской карты пользователя который может проверять администратор :$map ,у которого на счете $check")
        else("не сушествует такой карты")
        println( "на балансе карты $map находится $check")
    }
    open fun purchase()
    {
        if(check>=order)
        {
            check=check-order
            println("покупка оформлена успешно на счете осталось $check")
        }
        else println("вы не смогли аплатить покупку, администратор заблокировал карту")
    }
}