package Git;

public class Git {
    /*
    Установка через оф сайт или с IDEA https://git-scm.com/book/ru/v2/ВведениеУстановка-Git

    Запуск и работа через Git Bash

    после установки Git необходимо произвести начальную конфигурацию
    git config --global user.name “Имя Фамилия”
    git config --global user.email “Ваш email”
    git config --global color.ui true
     */
    //----------------------------------------------------------------------------------------------------------------------
    /*
    Создание проекта
    mkdir название_проекта
    cd название проекта
    git init - Инициализация Git в проекте
    в папке создалась скрытая папка.git (вся метаинформация необходимая git)

    Git хранит изменения ввиде снимков во времени, при этом если изменения не внесены, то этот снимок ссылается на предыдущий
     */
    //------------------------------------------------------------------------------------------------------------------
    /*
    Базовая работа с GIT
    (создание файла)
    Вы создали файл  - Статус “untracked”
    Вы изменили файл - Статус “modified”

    git add - Статус “staged” (подготовленный)

    git commit - Статус “committed” (зафиксированный)
    -------------------------------------------------------------------------------------------------------------------
    Базовая работа с GIT
    Создал файл Test.java
    Подготавливаем файл к commit’у - git add Test.java
    Делаем commit (фиксируем, “делаем снимок”) - git commit
    --------------------------------------------------------------------------------------------------------------------
    Команды
    git status - узнать текущий статус репозитория
    git add - подготовить файл(-ы) к commit’у
    git commit -m “Сообщение снимка” - сделать commit

    git log - просмотр всех commit в репозитории во врпеменной шкале

    git dif - показывает резницу между текущим состоянием репозитория, и состояния репозитория в прошлом
    git dif (без параметров) - Показывает разницу между текущим неотслеживаемым состоянием репозитория и последним снимком репозитория
    git diff --staged показывает разницу между текущим тслеживаемым состоянием репозитория и последним снимком репозитория
    git diff COMMIT_ID показывает разницу между текущим состоянием репозитория и указанным снимком репозитория
------------------------------------------------------------------------------------------------------------------------
    git reset
    Предназначена для отмены каких - либо изменений в проекте, откату проекта к какому - то снимку.
    Имеет 3 режима (в зависимости от радикальности отката к указанному коммиту):
    • --soft
    • --mixed
    • --hard

    синтаксис вызова
    git reset [--soft | --mixed | --hard] [commit]
                        Режим             Желаемый коммит
    hard - полностью удаляет все версии после той к которой откатились
    mixed (по умолчанию) - коммиты удаляются, изменеия остаются, но переводятся в неотслеживаемые
    soft - коммиты удаляются, изменения остаются, и остаются отслеживаемыми

    Указатель HEAD - Обычно указывает на последний (текущий) коммит
    HEAD можно смещать добавлением символа ^ после слова HEAD или ~1
    HEAD или HEAD~1- смешение на 1 коммит назад
    HEAD^^ или HEAD~2- смешение на 2 коммита назад
    --------------------------------------------------------------------------------------------------------------------
    git checkout
    Используется для перемещения между коммитами, версиями отдельных файлов и ветками
    Указатель HEAD находится в состоянии DETACHED (рус. отделенный). Он отделен от актуальной версии проекта. Любые изменения или коммиты
    сделанные в этом состоянии удаляются сборщиком мусора при переходе к другому коммиту
    git checkout <хэш commit #2>
    git checkout HEAD^^
    git checkout HEAD~2

    git checkout master - переход обратно к актуальному коммиту

    git checkout a0e33627548578d5b94c3b8f4f885303a2cd4eec -- file1 file2
    Возвращает два файла file1 и file2 к версии, которая была у них в указанном коммите

    git checkout -- file1
    Возвращает file1 к версии, которая была у него в последнем коммите (HEAD). Работает только для неотслеживаемых (untracked или modified) изменений

    git checkout -- .
    Возвращает все файлы в репозитории к версии, которая была у них в последнем коммите (HEAD). Работает только для неотслеживаемых
    (untracked или modified) изменений.

    -- (две черточки) говорит что команда закончена и идет обычный текст

     удалить отслеживаемые изменения? (уже сделал git add)
     комбинируем команды:
     git reset Переводит все отслеживаемые изменения в неотслеживаемые.
     git checkout -- . удаляем все неотслеживаемые изменения

     Дополнительные параметры git commit
        литер -a
        git commit -a -m "Сообщение коммита"
        - то же самое, что последовательное выполнение git add . и git commit -m "Сообщение коммита"
        Не добавляет в отслеживаемую зону (и в коммит, соответственно) новые (untracked) файлы. Добавляет только модифицированные (modified) файлы.

        слово --amend
        git commit --amend -m "Новое сообщение коммита"
        дополняет последний коммит, добавляя в него "свежие" изменения. Также, меняет сообщение последнего коммита. Новый коммит не создается!
        программа переводит нас в текстовый редактор. необходимо набрать :wq и нажать enter для выхода из него с сохранением результата
----------------------------------------------------------------------------------------------------------------------------------------
     git clean удаление неотслеживаемых (untracked) файлов
     git clean -n Показывает какие файлы будут удалены
     git clean -f  удаляет файлы
---------------------------------------------------------------------------------------------------------------------------
     */
    /*
    Разные способы сделать git add

    git add <список файлов> - git add file1 file2
    git add . - добавить все файлы в текущей папке
    git add *.java - добавить все файлы в текущей папке с расширением .java
    git add someDir/*.java - добавить все файлы в папке someDir с расширением .java
    git add someDir/ - добавить все файлы в папке someDir
    git add “*.java” - добавить все файлы в проекте с расширением .java
    ---------------------------------------------------------------------------------------------------------------------
     */
        /*
    Работа с удаленным репозиторием.
    git remote  Команда для настройки и просмотра удаленных репозиториев

    git remote -v - просмотр списка существующих удаленных репозиториев
    git remote add НАЗВАНИЕ_РЕПОЗИТОРИЯ АДРЕС_РЕПОЗИТОРИЯ - добавить новый удаленный репозиторий, который находится по указанному адресу.
    При этом, на нашем компьютере к удаленному репозиторию мы будем обращаться по его названию

    git remote remove НАЗВАНИЕ_РЕПОЗИТОРИЯ - удалить репозиторий с указанным названием

    Добавление удаленного репозитория
    git remote add origin https://github.com/NeilAlishev/Some-Name.git
    На нашем компьютере хранится только ссылка на удаленный репозиторий origin - название этой ссылки

    git push Команда для отправки локального репозитория на удаленный
    git push НАЗВАНИЕ_УДАЛЕННОГО_РЕПОЗИТОРИЯ ВЕТКА (git push origin master)
    Отправляем на удаленный репозиторий с именем origin нашу ветку master

    git pull Команда для получения обновлений с удаленного репозитория
     */
}