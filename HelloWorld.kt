import AntShares.SmartContract.Framework.FunctionCode
import AntShares.SmartContract.Framework.Services.AntShares.Storage
class helloworld:FunctionCode() {
    fun Main(args:Array<String>?) : ByteArray? {
            Storage.Put(Storage.getCurrentContext(), "Greeting to the World", "Hello World!")
            return Storage.Get(Storage.getCurrentContext(),"Greeting to the World")
    }
}
