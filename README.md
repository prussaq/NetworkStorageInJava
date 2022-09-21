# NetworkStorageInJava

The main principles and decisions in the implementation of the application:

Java FX functionality is used to implement the external form
To exchange data between the server and the client, the Netty library is used on both sides.
The exchange between the client and the server is implemented by sending command messages (an exhaustive list of command names is listed in the special auxiliary enam class) with the necessary arguments, as a result of which the receiving party performs the appropriate actions:
a response command is sent, including with the requested data,
changing the content of the external form (updating the list of files)
Error messages are displayed in case of incorrect requests
for receiving files, a chain of handlers suitable for this functionality is built in the pipeline;
at the end of receiving files, the chain of handlers in the pipeline is lined up in the initial (basic) version, suitable for receiving commands with arguments.
SQLLite is used to work with the database.
The necessary information about the database, port, path to the client file system and the client folder in the cloud is stored in the .properties files in the client and server module.
Основные принципы и решения при реализации работы приложения:

Для реализации внешней формы используется функционал Java FX
Для обмена данными между сервером и клиентом с обеих сторон используется библиотека Netty.
Обмен между клиентом и сервером реализован за счет отправления команд-сообщений (исчерпывающий перечень названий команд перечислен в специальном вспомогательном классе enam) с необходимыми аргументами, в результате которых принимающая сторона осуществляет соответствующие действия:
отправляется ответная команда, в том числе с запрошенными данными,
меняется содержание внешней формы (обновление списка файлов)
выводятся сообщения об ошибке в случае некорректных запросов
для приема файлов выстраивается в pipeline подходящая для этого функционала цепочка хэндлеров;
по окончании приема файлов цепочка хэндлеров в pipeline выстраивается в изначальный (базовый) вариант, подходящий для приема команд с аргументами.
Для работы с БД используется SQLLite.
Необходимая информация про БД, порт, путь к файловой системе клиента и папке клиента в облаке сохранена в файлах .properties в модуле клиента и сервера.
