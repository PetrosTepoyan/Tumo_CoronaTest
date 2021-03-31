
//
//  InformationBlock.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class InformationBlock: View {
    lateinit var title: String
    lateinit var value: String
    private val titleLabel = TextView()
    private val valueLabel = TextView()
    private val vStack: LinearLayout by lazy {
        val s = LinearLayout()
        s.axis = .vertical
        s.alignment = .leading
        s.spacing = 5
        s
    }
    
    constructor(title: String, value: String, isTestResult: Boolean = false) : super(frame = CGRect.init() {
        this.title = title
        this.value = value
        titleLabel.text = title
        titleLabel.font = UIFont.preferredFont(forTextStyle = .callout).bold()
        titleLabel.textAlignment = .left
        valueLabel.text = value
        valueLabel.font = UIFont.systemFont(ofSize = 20)
        valueLabel.textAlignment = .left
    
        this.addSubview(vStack)
        vStack.translatesAutoresizingMaskIntoConstraints = false
        NSLayoutConstraint.activate(listOf(vStack.widthAnchor.constraint(equalTo = widthAnchor), vStack.heightAnchor.constraint(equalTo = heightAnchor), vStack.centerYAnchor.constraint(equalTo = centerYAnchor), vStack.centerXAnchor.constraint(equalTo = centerXAnchor)))
        vStack.addArrangedSubview(titleLabel)
        vStack.addArrangedSubview(valueLabel)
        if (isTestResult) {
            valueLabel.text = value.uppercased()
            valueLabel.backgroundColor = UIColor.green.withAlphaComponent(0.2)
            valueLabel.textAlignment = .center
            valueLabel.translatesAutoresizingMaskIntoConstraints = false
            valueLabel.trailingAnchor.constraint(equalTo = trailingAnchor).isActive = true
            valueLabel.heightAnchor.constraint(equalToConstant = 30).isActive = true
        }
    }
    
    required constructor?(coder: NSCoder) {
        throw Exception("init(coder:) has not been implemented")
    }
}

// https://spin.atomicobject.com/2018/02/02/swift-scaled-font-bold-italic/
fun UIFont.withTraits(traits: UIFontDescriptor.SymbolicTraits) : UIFont {
    val descriptor = fontDescriptor.withSymbolicTraits(traits)
    return UIFont(descriptor = descriptor!!, size = 0)
}

//size 0 means keep the size as it is
fun UIFont.bold() : UIFont =
    withTraits(traits = .traitBold)

fun UIFont.italic() : UIFont =
    withTraits(traits = .traitItalic)
