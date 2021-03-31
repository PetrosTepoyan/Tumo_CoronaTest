
//
//  UserInformationSection.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class UserInformationSection: View {
    private var titleLabel = TextView()
    private val vStack: LinearLayout by lazy {
        val s = LinearLayout()
        s.axis = .vertical
        s.alignment = .leading
        s.distribution = .equalSpacing
        s.spacing = 30
        s
    }
    private val passport = InformationBlock(title = "Passport", value = "12345612")
    private val birthday = InformationBlock(title = "Date of birthday", value = "12/12/99")
    private val phone = InformationBlock(title = "Phone", value = "(099) 12-23-12")
    
    constructor() : super(frame = CGRect.init() {
        titleLabel.text = "User information"
        titleLabel.font = UIFont.preferredFont(forTextStyle = .title3).bold()
        this.addSubview(vStack)
        vStack.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(vStack.widthAnchor.constraint(equalTo = widthAnchor), vStack.heightAnchor.constraint(equalTo = heightAnchor), vStack.centerYAnchor.constraint(equalTo = centerYAnchor), vStack.centerXAnchor.constraint(equalTo = centerXAnchor)))
        val hStack = LinearLayout()
        hStack.axis = .horizontal
        hStack.distribution = .equalSpacing
        vStack.addArrangedSubview(titleLabel)
        vStack.addArrangedSubview(hStack)
        vStack.addArrangedSubview(phone)
        hStack.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(hStack.trailingAnchor.constraint(equalTo = trailingAnchor)))
        hStack.addArrangedSubview(passport)
        hStack.addArrangedSubview(birthday)
    }
    
    required constructor?(coder: NSCoder) {
        throw Exception("init(coder:) has not been implemented")
    }
}
