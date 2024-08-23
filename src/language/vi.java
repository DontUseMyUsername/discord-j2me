package language;

public class vi implements Language {
    public vi() {}
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
        "Tệp không có tên",

        // Title text for the attachment picker (native file picker) screen.
        "Chọn tệp đính kèm",

        // Softkey labels for going back to the previous screen.
        "Quay lại",
        "Quay lại",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Đóng",
        "Đóng",

        // Title text for attachment view screen.
        "Tệp đính kèm",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Tải lại",
        "Tải lại",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Đ.dấu đã đọc",
        "Đánh dấu đã đọc",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "Đ.dấu tất cả đã đọc",
        "Đánh dấu tất cả đã đọc",

        // Generic "Select" softkey labels.
        "Chọn",
        "Chọn",

        // Softkey labels for sending a message in the currently open channel.
        "Gửi",
        "Gửi tin nhắn",

        // Softkey labels for sending a reply to the selected message.
        "Trả lời",
        "Trả lời tin nhắn",

        // Softkey labels for sending an attachment in the currently open channel.
        "Gửi tệp",
        "Gửi tệp đính kèm",

        // Softkey labels for copying the text content of the selected message.
        "Sao chép",
        "Sao chép nội dung",

        // Softkey labels for editing the selected message.
        "Chỉnh sửa",
        "Chỉnh sửa",

        // Softkey labels for deleting the selected message.
        "Xóa",
        "Xóa",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "Mở URL",
        "Mở URL",

        // Channel view title suffix when reading older messages.
        " (cũ)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Không có gì ở đây",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Tải lại để xem các t.nhắn mới",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Đang kết nối lại",

        // Channel view banner shown when a message is being sent by the client.
        "Đang gửi t.nhắn",

        // Channel view banner shown when a message is being edited by the client.
        "Đang chỉnh sửa t.nhắn",

        // Channel view banner shown when a message is being deleted by the client.
        "Đang xóa t.nhắn",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Đang tải t.nhắn",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " đang nhập",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " đang nhập",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " người đang nhập",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Proxy này không hỗ trợ gửi tệp",
        "Proxy này không hỗ trợ xóa t.nhắn",
        "Proxy này không hỗ trợ chỉnh sửa t.nhắn",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "Không hỗ trợ FileConnection",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Cũ",
        "Xem các tin nhắn cũ",
        "Mới",
        "Xem các tin nhắn mới",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "Xem ",
        " tệp đ.kèm",
        " tệp đ.kèm",

        // Title for confirmation screen shown when deleting a message.
        "Xóa",

        // Body text for confirmation screen shown when deleting a message.
        "Bạn có chắc chắn muốn xóa tin nhắn này không?",

        // Generic softkey labels.
        "Có",
        "Có",
        "Không",
        "Không",
        "OK",
        "OK",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(không rõ)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(không có nội dung)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(nội dung không hỗ trợ)",

        // Message content shown for a message that has been deleted.
        "(tin nhắn đã xóa)",

        // Title text for direct message search screen.
        "Tìm kiếm t.nhắn t.tiếp",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Nhập tên người dùng",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "Không thể tìm thấy người dùng. Hãy tạo tin nhắn tr.tiếp từ một ứng dụng khác",

        // Title text for direct message list.
        "Tin nhắn trực tiếp",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Tìm kiếm",
        "Tìm kiếm",

        // Title text shown for all error message screens.
        "Lỗi",

        // Title text shown for guild (server) selector.
        "Các máy chủ",

        // Title text shown for favorite servers list.
        "Các máy chủ yêu thích",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Loại bỏ",
        "Loại bỏ",

        // Softkey command for adding a server to the favorites list.
        "Thích",
        "Thêm vào danh sách yêu thích",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "Lỗi kết nối: ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Kiểm tra mã truy cập của bạn",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "Lỗi HTTP ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "Chưa xác định URL CDN, các tệp đính kèm không khả dụng",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Hiện",
        "Hiện theo văn bản",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Mở",
        "Mở trong trình duyệt",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Đang tải...",

        // Loading screen text shown when an attachment is being sent.
        "Đang gửi tệp...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Lỗi khi gửi tệp: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Bỏ qua",
        "Bỏ qua",

        // Key press prompt shown in hotkey mapper.
        "Nhấn một phím để dùng cho:",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "gửi tin nhắn",
        "trả lời tin nhắn",
        "sao chép nội dung tin nhắn",
        "tải lại tin nhắn",
        "quay lại",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Phím này đã đặt cho ",

        // Title text shown in login screen.
        "Đăng nhập",

        // Proxy server warning message shown at the top of the login screen.
        "Chỉ sử dụng các proxy đáng tin cậy",

        // Help message for finding your token. Shown in login screen above the token field.
        "Bạn có thể lấy mã truy cập (token) từ công cụ phát triển (dev tools) của trình duyệt của bạn (trên mạng sẽ có hướng dẫn). Bạn nên sử dụng tài khoản phụ.",

        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Sử dụng Wi-Fi",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "URL API",
        "URL CDN",
        "URL Cổng",
        "Mã truy cập",

        // Softkey label for confirming the login options in the login screen.
        "Đăng nhập",
        "Đăng nhập",

        // Softkey command for exiting the application.
        "Thoát",
        "Thoát",

        // "Use gateway" option shown in login screen.
        "Sử dụng cổng",

        // Label for radio button field for token sending options.
        "Gửi mã truy cập như",

        // Token sending options.
        "Header (mặc định)",
        null,
        "Query parameter",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Hãy nhập mã truy cập",
        "Hãy nhập URL API",

        // Main menu items.
        // "Log out" brings you back to the login screen where you enter your token and other login settings.
        "Các máy chủ",
        "Các máy chủ yêu thích",
        "Tin nhắn trực tiếp",
        "Cài đặt",
        "Đăng xuất",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Ping ai đó",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Các kết quả tìm kiếm",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Không có kết quả",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Chưa chọn người dùng",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        "đã thêm ",
        " vào nhóm",

        // Status message shown when a user has left a group DM.
        "đã rời khỏi nhóm",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        "đã loại bỏ ",
        " khỏi nhóm",

        // Status messages.
        "đã bắt đầu cuộc gọi",
        "đã đổi tên nhóm",
        "đã đổi b.tượng nhóm",
        "đã ghim tin nhắn",
        "đã tham gia máy chủ",
        "đã nâng cấp máy chủ",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "đã nâng cấp máy chủ lên cấp ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        null,

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "không rõ",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ":",
        "/",
        "SA",
        "CH",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Mention",
        "Insert mention",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Gửi tin nhắn tới (@",
        "Gửi tin nhắn trong (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "Yêu cầu kết nối hoạt động đến cổng",

        // Title text for "copy message content" screen.
        "Sao chép tin nhắn",

        // Title text for "edit message content" screen.
        "Chỉnh sửa tin nhắn",

        // Title text for gateway disconnect prompt screen.
        "Đã ngắt kết nối",

        // Main body text for gateway disconnect prompt screen.
        "Lỗi kết nối đến cổng. Bạn có muốn thử kết nối lại không?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Thông tin",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Đang trả lời ",

        // Top label for the message entry box in the reply form.
        "Tin nhắn của bạn:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Ping tác giả",

        // Title text for settings menu.
        "Cài đặt",

        // Settings screen heading for themes section.
        "Chủ đề",

        // Theme options.
        "Tối",
        "Sáng",
        "Đen",

        // Settings screen heading for miscellaneous user interface related settings.
        "Giao diện",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Sử dụng g.diện cũ",

        // Settings option for using 12-hour time format in timestamps.
        "Định dạng giờ 12 tiếng",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Sử dụng trình chọn tệp của t.bị",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Tự động kết nối lại với cổng",

        // Settings option for enabling icons in server and direct message lists.
        "B.tượng máy chủ/t.nhắn t.tiếp",

        // Settings option for enabling nickname role colors.
        "Bảng tên nhiều màu",

        // Settings screen heading for message author font size.
        "P.chữ biểu thị ng. gửi tin nhắn",

        // Font size options.
        "Nhỏ",
        "Vừa",
        "Lớn",

        // Settings screen heading for message content font size.
        "Phông chữ n.dung tin nhắn",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Số lượng t.nhắn được tải",

        // Settings screen heading for selecting attachment file format.
        "Định dạng tệp",

        // Settings screen heading for maximum attachment size in pixels.
        "Kích cỡ tệp tối đa",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Hình dạng avatar",

        // Settings options for profile picture shape. "Circle (HQ)" is circle but with anti-aliasing and smoothing enabled.
        "Vuông",
        "Tròn",
        "Tròn (C.lượng cao)",

        // Settings section for profile picture resolution.
        "Độ phân giải avatar",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Chỉ sử dụng h.ảnh giữ chỗ",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Tắt",
        null,
        null,

        // Settings section for menu icon size.
        "Kích cỡ biểu tượng menu",

        // Settings section for controlling the display of reply messages.
        "Hiển thị các trả lời như",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Chỉ người nhận",

        // Settings option to show replies with the whole recipient message.
        "Tin nhắn đầy đủ",

        // Settings section for hotkey action management.
        "Các phím tắt",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Các phím tắt mặc định",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "Cài đặt phím tắt",
        "Đặt lại phím tắt",

        // Generic softkey labels. Currently used in settings menu.
        "Lưu",
        "Lưu",
        "Hủy",
        "Hủy",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "Phải thoát ứng dụng trước khi mở URL.",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "Không thể mở URL (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")\n\nBạn có thể thử sao chép URL vào trình duyệt của thiết bị: ",

        // Title text for URL list screen ('Open URL' option in channel view).
        "Chọn URL",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Thêm",
        "Thêm vào"
    };
}