
//
//  ProfileView.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class ProfileView: View {
    private val vStack: LinearLayout by lazy {
        val v = LinearLayout()
        v.alignment = .center
        v.axis = .vertical
        v.distribution = .equalSpacing
        v.spacing = 5
        v
    }
    
    constructor() : super(frame = CGRect.init() {
        addSubview(vStack)
        vStack.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(vStack.widthAnchor.constraint(equalTo = widthAnchor), vStack.heightAnchor.constraint(equalTo = heightAnchor), vStack.centerYAnchor.constraint(equalTo = centerYAnchor), vStack.centerXAnchor.constraint(equalTo = centerXAnchor)))
        val image = UIImage(named = "ProfilePicture")
        val imageView = ImageView(image = image)
        imageView.contentMode = .scaleAspectFit
        val fullNameLabel = TextView()
        fullNameLabel.font = UIFont.boldSystemFont(ofSize = 21)
        fullNameLabel.text = "User name and surname"
        val testDateLabel = TextView()
        testDateLabel.font = UIFont.systemFont(ofSize = 13)
        testDateLabel.text = "Test date: 12.12.22"
        val companyNameLabel = TextView()
        // https://stackoverflow.com/questions/36486761/make-part-of-a-uilabel-bold-in-swift
        val normalText = "Test done by "
        val normalString = NSMutableAttributedString(string = normalText)
        val boldText = "Company Name"
        val attrs = mapOf(NSAttributedString.Key.font to UIFont.boldSystemFont(ofSize = 15))
        val attributedString = NSMutableAttributedString(string = boldText, attributes = attrs)
        normalString.append(attributedString)
        companyNameLabel.attributedText = normalString
        vStack.addArrangedSubview(imageView)
        vStack.addArrangedSubview(fullNameLabel)
        vStack.addArrangedSubview(testDateLabel)
        vStack.addArrangedSubview(companyNameLabel)
    }
    
    //		imageView.translatesAutoresizingMaskIntoConstraints = false
    required//		NSLayoutConstraint.activate([
    //			imageView.widthAnchor.constraint(equalTo: imageView.heightAnchor)
    //		])
     constructor?(coder: NSCoder) {
        throw Exception("init(coder:) has not been implemented")
    }
}
