package Payment
open class Payments(var name:String,var map:Int,var bloc:String,var check:Int)
{

    open fun GetBloc()
    {
        if(bloc=="заблокированна"&&bloc=="разблокированна") println("статус карты на данны момент:$bloc")
        else println("нету таких вариантов")
    }
    open fun bank()
    {
        println("клиент пользуеться картой от  банка $name")
    }
    open fun maps()
    {
        if(map>1000)println("номер банковской карты пользователя который может проверять администратор :$map ,у которого на счете $check")
        else println("не сушествует такой карты")
    }
}