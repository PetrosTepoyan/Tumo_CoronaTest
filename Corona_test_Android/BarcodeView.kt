
//
//  BarcodeView.kt
//  Corona_test
//
//  Created by Петрос Тепоян on 3/29/21.
//
class BarcodeView: View {
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
        val image = UIImage(named = "Barcode")
        val imageView = ImageView(image = image)
        imageView.contentMode = .scaleAspectFit
        val topLabel = TextView()
        topLabel.text = "Scan QR code to see the result in the site of"
        topLabel.font = UIFont.systemFont(ofSize = 15)
        val bottomLabel = TextView()
        bottomLabel.text = "National eHealth Operator"
        bottomLabel.font = UIFont.boldSystemFont(ofSize = 15)
        vStack.addArrangedSubview(imageView)
        vStack.addArrangedSubview(topLabel)
        vStack.addArrangedSubview(bottomLabel)
    }
    
    required constructor?(coder: NSCoder) {
        throw Exception("init(coder:) has not been implemented")
    }
}
