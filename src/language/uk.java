package language;

public class uk implements Language {
    public uk() {}
    public String[] getStrings() { return strings; }

    static final String[] strings = {
        // Translation notes:
        // - Any line that begins with a "//" is a comment and is ignored.
        //   In this file, comments are used for explaining each string.
        // - Write your translated string inside the two quotation marks.
        // - If you need to use a quotation mark inside any of your translated
        //   strings, write it as \" instead.
        // - If the original string has any special formatting
        //   (e.g. space at the beginning or end), keep the formatting the same.
        // - If you want the English text to be shown for a specific string,
        //   replace the string with null (without any quotation marks).
        // - For any Discord-specific terminology (e.g. servers), use the same
        //   translated term that Discord officially uses for your language.

        // Notes about softkey command labels:
        // - Each softkey label has two variations, a short and a long one.
        // - In this translation file, the short labels are listed above the long ones.
        // - Short labels are used in places where there is limited screen space.
        // - Keep short labels as short as possible, ideally below 10 characters.
        //   If needed, you may use abbreviations.
        // - If a long label is short enough to where it could be used as a
        //   short label, use the same string for both labels.

        // Placeholder file name shown when the name of an attachment in the attachment view screen could not be loaded.
        "Файл без назви",

        // Title text for the attachment picker (native file picker) screen.
        "Виберіть вкладення",

        // Softkey labels for going back to the previous screen.
        "Назад",
        "Назад",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Закрити",
        "Закрити",

        // Title text for attachment view screen.
        "Вкладення",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Оновити",
        "Оновити",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Позн. як проч.",
        "Позначити як прочитане",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "Позн. всі як проч.",
        "Позначити всі як прочитане",

        // Generic "Select" softkey labels.
        "Вибрати",
        "Вибрати",

        // Softkey labels for sending a message in the currently open channel.
        "Надіслати",
        "Надіслати повідомлення",

        // Softkey labels for sending a reply to the selected message.
        "Відповісти",
        "Відповісти",

        // Softkey labels for sending an attachment in the currently open channel.
        "Завантажити",
        "Завантажити файл",

        // Softkey labels for copying the text content of the selected message.
        "Копіювати",
        "Копіювати вміст",

        // Softkey labels for editing the selected message.
        "Редагувати",
        "Редагувати",

        // Softkey labels for deleting the selected message.
        "Видалити",
        "Видалити",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "Відкр. URL",
        "Відкрити URL-адресу",

        // Channel view title suffix when reading older messages.
        " (старі)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Тут нема нічого цікавого",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Оновіть, щоб прочитати нові повідомлення",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Повторне з’єднання",

        // Channel view banner shown when a message is being sent by the client.
        "Надсилання повідомлення",

        // Channel view banner shown when a message is being edited by the client.
        "Редагування повідомлення",

        // Channel view banner shown when a message is being deleted by the client.
        "Видалення повідомлення",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Завантаження повідомлень",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " пише...",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " пишуть...",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " людини(ей) пишуть...",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Цей проксі-сервер не підтримує завантаження файлів",
        "Цей проксі-сервер не підтримує видалення повідомлень",
        "Цей проксі-сервер не підтримує редагування повідомлень",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "FileConnection API не підтримується",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Старі",
        "Переглянути старі повідомлення",
        "Нові",
        "Переглянути нові повідомлення",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "Переглянути ",
        " вкладення",
        " вкладення(нь)",

        // Title for confirmation screen shown when deleting a message.
        "Видалити",

        // Body text for confirmation screen shown when deleting a message.
        "Видалити це повідомлення?",

        // Generic softkey labels.
        "Так",
        "Так",
        "Ні",
        "Ні",
        "ОК",
        "ОК",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(невідомо)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(немає вмісту)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(повідомлення не підтримується)",

        // Message content shown for a message that has been deleted.
        "(повідомлення видалено)",

        // Title text for direct message search screen.
        "Пошук ПП",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Введіть ім'я користувача",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "Користувача не знайдено. Спробуйте створити ПП з іншого клієнта.",

        // Title text for direct message list.
        "Приватні повідомлення",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Пошук",
        "Шукати",

        // Title text shown for all error message screens.
        "Помилка",

        // Title text shown for guild (server) selector.
        "Сервери",

        // Title text shown for favorite servers list.
        "Обрані сервери",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Видалити",
        "Видалити з обраних",

        // Softkey command for adding a server to the favorites list.
        "До обраних",
        "Додати до обраних",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "Помилка підключення: ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Перевірте свій токен",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "Помилка HTTP: ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "Адреса CDN не визначена. Вкладення недоступні.",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Показати",
        "Показати як текст",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Відкрити",
        "Відкрити в браузері",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Завантаження...",

        // Loading screen text shown when an attachment is being sent.
        "Надсилання...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Помилка під час надсилання файлу: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Пропустити",
        "Пропустити",

        // Key press prompt shown in hotkey mapper.
        "Натисніть клавішу для:",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "надсилання повідомлення",
        "відповіді на повідомлення",
        "копіювання вмісту повідомлення",
        "оновлення повідомлень",
        "повернення назад",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Ця клавіша вже призначена до ",

        // Title text shown in login screen.
        "Вхід",

        // Proxy server warning message shown at the top of the login screen.
        "Використовуйте лише ті проксі-сервери, яким ви довіряєте!",

        // Help message for finding your token. Shown in login screen above the token field.
        "Токен можна знайти в інструментах розробника вашого браузера (шукайте довідку в інтернеті). Рекомендується використовувати альтернативний обліковий запис.",

        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Використовувати Wi-Fi",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "Адреса API",
        "Адреса CDN",
        "Адреса шлюзу",
        "Токен",

        // Softkey label for confirming the login options in the login screen.
        "Увійти",
        "Увійти",

        // Softkey command for exiting the application.
        "Вийти",
        "Вийти",

        // "Use gateway" option shown in login screen.
        "Використовувати шлюз",

        // Label for radio button field for token sending options.
        "Надіслати токен як",

        // Token sending options.
        "Заголовок (стд параметр)",
        "JSON",
        "Параметр запиту",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Будь ласка, введіть свій токен",
        "Будь ласка, вкажіть адресу API",

        // Main menu items.
        // "Log out" brings you back to the login screen where you enter your token and other login settings.
        "Сервери",
        "Обрані сервери",
        "Приватні повідомлення",
        "Налаштування",
        "Вийти з облікового запису",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Вставити згадку",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Результати пошуку",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Результатів не знайдено",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Користувача не вибрано",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        "додав ",
        " до групи",

        // Status message shown when a user has left a group DM.
        "покинув групу",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        "видалив ",
        " з групи",

        // Status messages.
        "розпочав виклик",
        "змінив назву групи",
        "змінив піктограму групи",
        "закріплює повідомлення",
        "приєднався до сервера",
        "підсилює сервер бустом!",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "додає буст до сервера! Сервер досяг рівня ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        "(стікер: ",

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "невідомий",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ":",
        ".",
        "ДП",
        "ПП",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Згадати",
        "Вставити згадку",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Надіслати повідомлення (@",
        "Надіслати повідомлення (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "Потрібне активне з'єднання до шлюзу",

        // Title text for "copy message content" screen.
        "Копіювання повідомлення",

        // Title text for "edit message content" screen.
        "Редагування повідомлення",

        // Title text for gateway disconnect prompt screen.
        "Від'єднано",

        // Main body text for gateway disconnect prompt screen.
        "Помилка шлюзу. Бажаєте відновити з'єднання?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Повідомлення",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Відповідь користувачеві ",

        // Top label for the message entry box in the reply form.
        "Ваше повідомлення:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Згадати автора",

        // Title text for settings menu.
        "Налаштування",

        // Settings screen heading for themes section.
        "Оформлення",

        // Theme options.
        "Темне",
        "Світле",
        "Чорне",

        // Settings screen heading for miscellaneous user interface related settings.
        "Інтерфейс користувача",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Старий інтерфейс",

        // Settings option for using 12-hour time format in timestamps.
        "12-год. формат часу",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Нативний вибір файлів",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Автом. з'єдн. до шлюзу",

        // Settings option for enabling icons in server and direct message lists.
        "Піктогр. серверів/ПП",

        // Settings option for enabling nickname role colors.
        "Кольори ролей",

        // Settings screen heading for message author font size.
        "Шрифт автора повідомлення",

        // Font size options.
        "Маленький",
        "Середній",
        "Великий",

        // Settings screen heading for message content font size.
        "Шрифт вмісту повідомлення",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Кількість завантажуваних повідомлень",

        // Settings screen heading for selecting attachment file format.
        "Формат вкладення",

        // Settings screen heading for maximum attachment size in pixels.
        "Макс. розмір вкладення",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Форма аватара",

        // Settings options for profile picture shape. "Circle (HQ)" is circle but with anti-aliasing and smoothing enabled.
        "Квадратна",
        "Кругла",
        "Кругла (вис. якість)",

        // Settings section for profile picture resolution.
        "Роздільна здатність аватара",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Тільки ініціали",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Вимк.",
        "16 пікс.",
        "32 пікс.",

        // Settings section for menu icon size.
        "Розмір піктограми меню",

        // Settings section for controlling the display of reply messages.
        "Показувати відповіді як",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Тільки одержувач",

        // Settings option to show replies with the whole recipient message.
        "Одерж. + повідомл.",

        // Settings section for hotkey action management.
        "Гарячі клавіші",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Стандартні гар. кл.",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "Призначити клавіші",
        "Перепризн. гар. кл.",

        // Generic softkey labels. Currently used in settings menu.
        "Зберегти",
        "Зберегти",
        "Скасувати",
        "Скасувати",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "Перш ніж відкрити URL-адресу, потрібно закрити програму.",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "Не вдалося відкрити URL-адресу (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")\n\nВи можете спробувати вручну скопіювати її в браузер свого пристрою: ",

        // Title text for URL list screen ('Open URL' option in channel view).
        "Вибрати URL-адресу",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Вставити",
        "Вставити"
    };
}